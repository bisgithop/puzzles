// Useful - when searching for an element in a sorted array tree should be fastest 

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}


public static TreeNode sortedArrayToBST(int[] nums) {
    if (nums.length == 0) return null;
    return constructBST(nums, 0, nums.length - 1);
}

private static TreeNode constructBST(int[] nums, int left, int right) {
    if (left > right) return null;

    int mid = left + (right - left) / 2;
    TreeNode node = new TreeNode(nums[mid]);
    node.left = constructBST(nums, left, mid - 1);
    node.right = constructBST(nums, mid + 1, right);
    return node;
}


public class BinarySearch {

    // 1. Recursive Approach (Clean and simple)
    public static TreeNode searchRecursive(TreeNode root, int target) {
        // Base case: root is null (not found) or root is the target
        if (root == null || root.val == target) {
            return root;
        }

        // If target is smaller, search the left subtree
        if (target < root.val) {
            return searchRecursive(root.left, target);
        }

        // If target is larger, search the right subtree
        return searchRecursive(root.right, target);
    }

    // 2. Iterative Approach (More memory efficient, no stack overhead)
    public static TreeNode searchIterative(TreeNode root, int target) {
        TreeNode current = root;
        
        while (current != null) {
            if (target == current.val) {
                return current; // Found it
            } else if (target < current.val) {
                current = current.left; // Go left
            } else {
                current = current.right; // Go right
            }
        }
        
        return null; // Not found
    }

    public static void main(String[] args) {
        // Example usage:
        // Assume 'root' was built from a sorted array: [1, 2, 3, 4, 5]
        // Resulting BST might have 3 as root, 2 as left, 4 as right...
        
        int target = 4;
        TreeNode result = searchIterative(root, target);

        if (result != null) {
            System.out.println("Value " + target + " found in the tree!");
        } else {
            System.out.println("Value " + target + " not found.");
        }
    }
}
