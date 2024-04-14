package CalculateSizeOfTree;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

class TreeSizeCalculator implements Callable<Integer>{
    private Node root;
    private ExecutorService es;
    public TreeSizeCalculator(Node root, ExecutorService es)
    {
       this.root = root;
       this.es = es;
    }
    
    public Integer call() throws InterruptedException{
        if(root == null){
            return 0;
        }

        TreeSizeCalculator leftTree = new TreeSizeCalculator(root.left, es);
        TreeSizeCalculator rightTree = new TreeSizeCalculator(root.right, es);

        try {
            Integer leftSize = es.submit(leftTree).get();
            Integer rightSize = es.submit(rightTree).get();
            return 1+ leftSize + rightSize;
        } catch (Exception e) {
            // TODO: handle exception
        }
        return 0;
    }
}