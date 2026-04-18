// gameParserApp.java

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

// gameParserApp.java

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;

public class gameParserApp extends JFrame {

    static String source = "";

    java.util.List<GameObject> objects = new ArrayList<>();
    Timer timer;

    public gameParserApp() {

        setTitle("Mini Game Engine");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        DrawingCanvas canvas = new DrawingCanvas();
        add(canvas);

        parseGame();

        // ⏱️ loop do jogo (1 segundo)
        
        TimerTask task = new TimerTask() {
        public void run() {
            for (GameObject obj : objects) {
                obj.update();
            }
            repaint();}
        };
        
        Timer timer = new Timer("Timer");
        long delay = 1000L;
        long period = 1000L;
        timer.scheduleAtFixedRate(task, delay, period);
    }

    void parseGame() {
        try {
            File file = new File("my.game");
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                source += reader.nextLine() + "\n";
            }
            reader.close();

        } catch (Exception e) {
            System.out.println("Erro ao ler ficheiro.");
        }

        CharStream input = CharStreams.fromString(source);
        gameLexer lexer = new gameLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        gameParser parser = new gameParser(tokens);

        ParseTree tree = parser.program();

        EvalVisitor visitor = new EvalVisitor();
        visitor.visit(tree);

        objects = visitor.objects;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new gameParserApp().setVisible(true);
        });
    }

    // ==========================
    // Canvas
    // ==========================
    class DrawingCanvas extends JPanel {

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // limpar ecrã
            g.setColor(Color.BLACK);
            g.fillRect(0, 0, getWidth(), getHeight());

            for (GameObject obj : objects) {

                switch (obj.type) {
                    case "CASTLE":
                        g.setColor(Color.GRAY);
                        break;
                    case "HOUSE":
                        g.setColor(Color.GREEN);
                        break;
                    case "MAN":
                        g.setColor(Color.WHITE);
                        break;
                }

                g.fillRect(obj.x, obj.y, 50, 50);
            }
        }
    }
}