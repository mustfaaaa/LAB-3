package decorators.source;
public interface DataSource {
    void writeData(String data);

    String readData();
}