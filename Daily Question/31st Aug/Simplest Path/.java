import java.util.*;

class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack = new LinkedList<>();
        String[] components = path.split("/");
    
        for (String dir : components) {
            if (dir.equals(".") || dir.isEmpty()) {
                continue;
            } else if (dir.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(dir);
            }
        }
    
        StringBuilder simplifiedPath = new StringBuilder();
        for (String dir : stack) {
            simplifiedPath.insert(0, "/" + dir);
        }
    
        return simplifiedPath.length() > 0 ? simplifiedPath.toString() : "/";
    }
 }