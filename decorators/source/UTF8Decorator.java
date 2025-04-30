package decorators.source;

import java.nio.charset.StandardCharsets;

public class UTF8Decorator extends DataSourceDecorator {

    public UTF8Decorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        // Ensure data is stored as UTF-8 encoded string
        byte[] utf8Bytes = data.getBytes(StandardCharsets.UTF_8);
        String utf8Encoded = new String(utf8Bytes, StandardCharsets.UTF_8);
        super.writeData(utf8Encoded);
    }

    @Override
    public String readData() {
        String rawData = super.readData();
        byte[] utf8Bytes = rawData.getBytes(StandardCharsets.UTF_8);
        return new String(utf8Bytes, StandardCharsets.UTF_8);
    }
}