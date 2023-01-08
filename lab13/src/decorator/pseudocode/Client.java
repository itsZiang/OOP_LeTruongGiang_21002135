package decorator.pseudocode;

public class Client {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith, 100000\nSteven Jobs, 912000";
        DataSource plain = new FileDataSource("out/OutputDemo.txt");
        DataSourceDecorator encoded = new CompressionDecorator(new EncryptionDecorator(plain));
        encoded.writeData(salaryRecords);


        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
