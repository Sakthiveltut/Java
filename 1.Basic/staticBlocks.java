class BlockTest
{
    static {
        System.out.println("BlockTest-1");
    }
    static {
        System.out.println("BlockTest-2");
    }
}
public class staticBlocks {
    static {
        System.out.println("Block-1");
    }
    public static void main(String[] args) {
        BlockTest o =new BlockTest();
        System.out.println("Main");
    }
    static {
        System.out.println("Block-2");
    }
}