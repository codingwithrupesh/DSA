public class GetShortestPath {
    public static float shortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'E') {
                x++;
            } else if (path.charAt(i) == 'W')
                x--;
            else if (path.charAt(i) == 'N')
                y++;
            else
                y--;
        }
        float X2 = x * x;
        float Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        // String path = "EW";
        System.out.println(shortestPath(path));
    }

}
