package leetcode.medium._297;

import sun.awt.image.ImageWatched;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        return re_serialize(root, "");
    }
    public String re_serialize(TreeNode root, String seq) {
        if(root==null){
            seq+="null, ";
        }else{
            seq+=String.valueOf(root.val)+", ";
            this.re_serialize(root.left, seq);
            this.re_serialize(root.right, seq);
        }
        return seq;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] data_array = data.split(",");
        System.out.println(data_array);
        System.out.println(Arrays.asList(data_array));
        List<String> dataList = new LinkedList<String>(Arrays.asList(data_array));
        return re_deserialize(dataList);

    }

    public TreeNode re_deserialize(List<String> dataList) {
        if(dataList.isEmpty()){
            return null;
        }
        if (dataList.get(0).equals("null")) {
            dataList.remove(0);
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(dataList.get(0)));
        dataList.remove(0);
        root.left = this.re_deserialize(dataList);
        root.right = this.re_deserialize(dataList);

        return root;

    }

    public static void main(String[] args) {
        System.out.println(new Codec().deserialize("1,2,3,null,null,4,5"));
    }

}
