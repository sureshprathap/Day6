package exercise;

import java.io.File;

public class IllegalEx {
     
    /**
     * 
     * @param parent, The path of the parent node.
     * @param filename, The filename of the current node.
     * @return The relative path to the current node, starting from the parent node.
     */
    public static String createRelativePath(String parent, String filename) {
        if(parent == null)
            throw new IllegalArgumentException("The parent path cannot be null!");
         
        if(filename == null)
            throw new IllegalArgumentException("The filename cannot be null!");
         
        return parent + File.separator + filename;
    }
     
    public static void main(String[] args) {
        // The following command will be successfully executed.
        System.out.println(IllegalEx.createRelativePath("dir1", "file1"));
        System.out.println();
         
        // The following command throws an IllegalArgumentException.
        System.out.println(IllegalEx.createRelativePath(null, "file1"));
    }
}
