public class Arrayoutofbound {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        for(int i=0;i< arr.length+1;i++)
        {try {

            System.out.println(arr[i]);
        }
        catch (Throwable e)
        {
            System.out.println(e.getMessage());
        }

        }

    }
}

