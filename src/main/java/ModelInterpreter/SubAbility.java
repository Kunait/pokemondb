package ModelInterpreter;

public class SubAbility {
    String version;
    int level;

    public SubAbility(String version, int level) {
        this.version = version;
        this.level = level;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
