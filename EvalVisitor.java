import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;

public class EvalVisitor extends gameBaseVisitor<Void> {

    public List<GameObject> objects = new ArrayList<>();

    @Override
    public Void visitCreate(gameParser.CreateContext ctx) {

        String type = ctx.getChild(0).getText();

        int x = Integer.parseInt(ctx.value(0).getText());
        int y = Integer.parseInt(ctx.value(1).getText());

        objects.add(new GameObject(type, x, y));

        return null;
    }

    @Override
    public Void visitMove(gameParser.MoveContext ctx) {

        int index = Integer.parseInt(ctx.INT().getText());
        String axis = ctx.eixo().getText();
        int speed = Integer.parseInt(ctx.value().getText());

        if (index >= 0 && index < objects.size()) {
            GameObject obj = objects.get(index);

            if (axis.equals("X")) obj.dx = speed;
            if (axis.equals("Y")) obj.dy = speed;
        }

        return null;
    }

    @Override
    public Void visitLimits(gameParser.LimitsContext ctx) {

        int index = Integer.parseInt(ctx.INT().getText());

        if (index >= 0 && index < objects.size()) {
            GameObject obj = objects.get(index);

            obj.minX = Integer.parseInt(ctx.value(0).getText());
            obj.maxX = Integer.parseInt(ctx.value(1).getText());
            obj.minY = Integer.parseInt(ctx.value(2).getText());
            obj.maxY = Integer.parseInt(ctx.value(3).getText());
        }

        return null;
    }
}