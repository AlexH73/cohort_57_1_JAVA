package Hausaufgaben.Hausaufgaben_23;

public class ImmutableConfig {
    private String databaseUrl;
    private int maxConnections;
    private boolean isLoggingEnabled;

    public ImmutableConfig(String databaseUrl, int maxConnections, boolean isLoggingEnabled) {
        this.databaseUrl = databaseUrl;
        this.maxConnections = maxConnections;
        this.isLoggingEnabled = isLoggingEnabled;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public boolean isLoggingEnabled() {
        return isLoggingEnabled;
    }
}
