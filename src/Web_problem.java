import java.util.Scanner;

public class Web_problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the url=");
        String url=sc.nextLine();
        String Protocol=url.substring(0, url.indexOf(":"));
        if(Protocol.equals("http"))
        {
            System.out.println("Hypertext transfer Propocal");
        }
        else if(Protocol.equals("ftp"))
        {
            System.out.println("File Transfer protocol");
        }
        String ext=url.substring(url.lastIndexOf(".")+1);
        if (ext.equals("com"))
        {
            System.out.println("Commercial");
        }
        else if(ext.equals("org"))
        {
            System.out.println("organization");
        }
        else if (ext.equals("net"))
        {
            System.out.println("network");
        }
    }

}
