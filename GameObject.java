public class GameObject {

    String type;
    int x, y;

    int dx = 0, dy = 0;

    int minX = 0, maxX = 550;
    int minY = 0, maxY = 350;

    public GameObject(String type, int x, int y) {
        this.type = type;
        this.x = x;
        this.y = y;
    }

    public void update() {
        x += dx;
        y += dy;

        if (x <= minX || x >= maxX) dx = -dx;
        if (y <= minY || y >= maxY) dy = -dy;
    }
}