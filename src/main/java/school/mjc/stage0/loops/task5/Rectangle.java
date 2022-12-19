package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){

        if (length>1 &&height>1){
            for(int i=0;i<length;i++){
                System.out.print("8");
            }
            System.out.println();
            String Empty="";
            for (int i=2;i<length;i++){
                Empty+=" ";
            }
            for(int j=2;j<height;j++){
                //for(int k=0;k<length;k++){
                    System.out.print("8"+Empty+"8");
                //}
                System.out.println();
            }


            for(int i=0;i<length;i++){
                System.out.print("8");
            }
        }
        if(length==1 && height ==1){
            System.out.println("8");
        }
        if (length==2 &&height==1){
            System.out.println("88");
        }
        if (length==1 &&height==2){
            System.out.println("8");
            System.out.println("8");
        }

    }
}
