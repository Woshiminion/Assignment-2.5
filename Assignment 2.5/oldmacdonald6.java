class oldmacdonald6{
    public static void main(String[]args){
        displayBox(5,3);

    }

    public static void displayBox(int height, int width){
        for(int i = 0; i<height; i++){
            for(int x = 0; x<width; x++){
                System.out.print("$");
            }
            System.out.println("");
        }

 
    }
}