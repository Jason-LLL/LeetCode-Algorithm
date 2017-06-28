public class Solution {
     public int index = -1;  // 节点在序列中的索引
 
    /**
     * 序列化
     * 前序遍历，将二叉树节点的值转为字符序列，null转为“#”
     *
     * @param root
     * @return
     */
    String Serialize(TreeNode root) {
        StringBuffer s = new StringBuffer();
        if (root == null) {
            s.append("#,");
            return s.toString();
        }
        s.append(root.val + ",");
        s.append(Serialize(root.left));
        s.append(Serialize(root.right));
        return s.toString();
    }
 
    /**
     * 反序列化
     *
     * @param str
     * @return
     */
    TreeNode Deserialize(String str) {
        index++;
        int length = str.length();
        if (index >= length) {
            return null;
        }
        String[] nodeSeq = str.split(",");
        TreeNode pNode = null;
        if (!nodeSeq[index].equals("#")) {
            pNode = new TreeNode(Integer.valueOf(nodeSeq[index]));
            pNode.left = Deserialize(str);
            pNode.right = Deserialize(str);
        }
        return pNode;
    }
}