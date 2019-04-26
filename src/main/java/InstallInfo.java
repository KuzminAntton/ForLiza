
public class InstallInfo {

    private String timestamp;
    private String network;
    private String campaign;
    private String group;

    public InstallInfo(String timestamp, String network, String campaign, String group) {
        this.timestamp = timestamp;
        this.network = network;
        this.campaign = campaign;
        this.group = group;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getNetwork() {
        return network;
    }

    public String getCampaign() {
        return campaign;
    }

    public String getGroup() {
        return group;
    }


    @Override
    public String toString() {
        return
                       timestamp + ","
                             + network + ","
                        + campaign + ","
                        + group ;
    }
}
