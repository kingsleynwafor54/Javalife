package SwitchCase;

public class CommandLineArgs {
    public static void main(String[] args) {
        int total=0;
                for(int counter = 0; counter<args.length; counter++) {
                   total+=Integer.parseInt(args[counter]);
                    System.out.println(args[counter]);
//                    System.out.println("args[" + i + "]: " + args[i]);
                }
        System.out.println(total);
//        for(String str: args) {
//            // convert into integer type
//            int argument = Integer.parseInt(str);
//            System.out.println("Argument in integer form: " + argument);
        }
    }

//}

