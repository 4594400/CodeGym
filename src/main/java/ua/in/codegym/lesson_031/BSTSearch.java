package ua.in.codegym.lesson_031;


public class BSTSearch {

    public boolean exist(TreeNode root, int target) {
        if (root==null) return false;
        while (root.value != target) {
            if (target < root.value) {
                root = root.left;
            } else {
                root = root.right;
            }
            if (root==null)
                return false;
        }
        return true;
    }
}

class TreeNode {
    int value;
    TreeNode left, right;
}
