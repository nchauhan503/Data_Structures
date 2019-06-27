/* -----------------------------------
 *  WARNING:
 * -----------------------------------
 *  Your code may fail to compile
 *  because it contains public class
 *  declarations.
 *  To fix this, please remove the
 *  "public" keyword from your class
 *  declarations.
 */
package com.LeetCode;

//import javax.swing.tree.TreeNode;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class Main {
    public static TreeNode stringToTreeNode(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return null;
        }

        String[] parts = input.split(",");
        String item = parts[0];
        TreeNode root = new TreeNode(Integer.parseInt(item));
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        int index = 1;
        while(!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.remove();

            if (index == parts.length) {
                break;
            }

            item = parts[index++];
            item = item.trim();
            if (!item.equals("null")) {
                int leftNumber = Integer.parseInt(item);
                node.left = new TreeNode(leftNumber);
                nodeQueue.add(node.left);
            }

            if (index == parts.length) {
                break;
            }

            item = parts[index++];
            item = item.trim();
            if (!item.equals("null")) {
                int rightNumber = Integer.parseInt(item);
                node.right = new TreeNode(rightNumber);
                nodeQueue.add(node.right);
            }
        }
        return root;
    }

    public static String treeNodeToString(TreeNode root) {
        if (root == null) {
            return "[]";
        }

        String output = "";
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while(!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.remove();

            if (node == null) {
                output += "null, ";
                continue;
            }

            output += String.valueOf(node.val) + ", ";
            nodeQueue.add(node.left);
            nodeQueue.add(node.right);
        }
        return "[" + output.substring(0, output.length() - 2) + "]";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            TreeNode t1 = stringToTreeNode(line);
//            line = in.readLine();
//            TreeNode t2 = stringToTreeNode(line);
//
//            TreeNode ret = new Solution().mergeTrees(t1, t2);

            TreeNode ret = new Solution().invertTree(t1);
            String out = treeNodeToString(ret);
            System.out.print(out);
//            String out = treeNodeToString(ret);
//            System.out.print(out);

            if(out != null){
                System.exit(1);
            }

//            int out = new Solution().deptTree(t1);
//            System.out.print(out);
//            if ( out != 0) {
//                System.exit(1);
//            }

        }
    }
}

  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

  class Solution {

        TreeNode invertTree(TreeNode root) {
//            if(root == null ){
//                return null;
//            }else if( root != null){
//
//                TreeNode temp = new TreeNode(0);
//                temp.right = root.left;
//                root.left = root.right;
//                root.right = temp.right;
//
//                temp.left = invertTree(root.right);
//                root.right = temp.left;
//                temp.right = invertTree(root.left);
//                root.left = temp.right;
//            }
//            return root;
            //
            if (root == null) {
                return null;
            }
            TreeNode right = invertTree(root.right);
            TreeNode left = invertTree(root.left);
            root.left = right;
            root.right = left;
            return root;
            //
        }


        int deptTree(TreeNode t1){
            int dept = 0;

            dept = findMaxDept(t1,dept);

            return dept;
        }

        int findMaxDept(TreeNode t1, int dept){
            if (t1 == null){
                return dept;
            }else{
                dept++;
            }


            int dept1 = findMaxDept(t1.left,dept);
            int dept2 = findMaxDept(t1.right,dept);

            return Math.max(dept1,dept2);
        }

        TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

            if (t1 == null) {
                return t2;
            }

            if (t2 == null){
                return t1;
            }

            t1.val = t1.val + t2.val;

            t1.right = mergeTrees(t1.right, t2.right);

            t1.left = mergeTrees(t1.left,t2.left);

            return t1;
        }

    }


//    public void add(TreeNode t1, TreeNode t2) {
//
//        if (t1 == null && t2 != null) {
//            returnTree = t2;
//            if ( t2.right != null){
//                add(null, t2.right, returnTree.right);
//            }
//
//            if (t2.left != null){
//                add(null, t2.left, returnTree.left);
//            }
//
//        } else if (t2 == null && t1 != null) {
//            returnTree = t1;
//            if (t1.right != null ){
//                add(t1.right, null, returnTree.right);
//            }
//
//            if (t1.left != null ) {
//                add(t1.left, null, returnTree.left);
//            }
//
//
//        } else if (t1 != null && t2 != null) {
//            returnTree = new TreeNode(t1.val + t2.val);
//            if (t1.right != null && t2.right != null) {
//                add(t1.right, t2.right, returnTree.right);
//            }
//
//            if (t1.left != null && t2.left != null) {
//                add(t1.left, t2.left, returnTree.left);
//            }
//        } else {
//            return;
//        }






//        if (t1.right != null && t2.right != null) {
//            add(t1.right, t2.right, returnTree.right);
//        } else if (t1.right != null && t2.right == null){
//            add(t1.right, null, returnTree.right);
//        } else if (t1.right == null && t2.right != null){
//            add(null, t2.right, returnTree.right);
//        }else{
//            return;
//        }
//
//
//
//        if (t1.left != null && t2.left != null) {
//            add(t1.left, t2.left, returnTree.left);
//        } else if (t1.left != null && t2.left == null){
//            add(t1.left, null, returnTree.left);
//        } else if (t1.left == null && t2.left != null){
//            add(null, t2.left, returnTree.left);
//        }else{
//            return;




