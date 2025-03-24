import java.util.*;

public class Ratinmaze {
    public static void findpaths(int[][] maze, int x, int y, int n, boolean[][] visited, String path, List<String> paths) {
        if (x == n - 1 && y == n - 1) {
            paths.add(path);
            return;
        }

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        char[] move = {'D', 'R', 'U', 'L'};

        for (int i = 0; i < 4; i++) {
            int newx = x + dx[i];
            int newy = y + dy[i];

            if (issafe(newx, newy, n, maze, visited)) {
                visited[newx][newy] = true;
                findpaths(maze, newx, newy, n, visited, path + move[i], paths);
                visited[newx][newy] = false;
            }
        }
    }

    public static boolean issafe(int x, int y, int n, int[][] maze, boolean[][] visited) {
        return x >= 0 && y >= 0 && x < n && y < n && maze[x][y] == 1 && !visited[x][y];
    }

    public static List<String> fpim(int[][] maze) {
        List<String> paths = new ArrayList<>();
        int n = maze.length;
        if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0) {
            return paths;
        }
        boolean[][] visited = new boolean[n][n];
        visited[0][0] = true;
        findpaths(maze, 0, 0, n, visited, "", paths);
        return paths;
    }

    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 1},
            {1, 1, 1, 1}
        };
        List<String> res = fpim(maze);
        System.out.println(res);
    }
}
    