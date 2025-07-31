class DisplayPanel {
    String resolution;
    double size;
    String panelType;
    String refreshRate;

    public DisplayPanel(String resolution, double size, String panelType, String refreshRate) {
        super();
        this.resolution = resolution;
        this.size = size;
        this.panelType = panelType;
        this.refreshRate = refreshRate;
    }

    public void displayPanelInfo() {
        System.out.println("\n--------------------------DISPLAY PANEL--------------------------");
        System.out.println("Resolution: " + resolution);
        System.out.println("Size: " + size + " inches");
        System.out.println("Panel Type: " + panelType);
        System.out.println("Refresh Rate: " + refreshRate);
    }
}

class SpeakerSystem {
    int outputPower;
    boolean dolbySupport;
    String speakerType;
    String manufacturer;

    public SpeakerSystem(int outputPower, boolean dolbySupport, String speakerType, String manufacturer) {
        super();
        this.outputPower = outputPower;
        this.dolbySupport = dolbySupport;
        this.speakerType = speakerType;
        this.manufacturer = manufacturer;
    }

    public void displaySpeakerInfo() {
        System.out.println("\n--------------------------SPEAKER SYSTEM--------------------------");
        System.out.println("Output Power: " + outputPower + "W");
        System.out.println("Dolby Support: " + (dolbySupport ? "Yes" : "No"));
        System.out.println("Speaker Type: " + speakerType);
        System.out.println("Manufacturer: " + manufacturer);
    }
}

class RemoteControl {
    boolean voiceControl;
    String connectivity;
    int batteryLife;
    String model;

    public RemoteControl(boolean voiceControl, String connectivity, int batteryLife, String model) {
        super();
        this.voiceControl = voiceControl;
        this.connectivity = connectivity;
        this.batteryLife = batteryLife;
        this.model = model;
    }

    public void displayRemoteInfo() {
        System.out.println("\n--------------------------REMOTE CONTROL--------------------------");
        System.out.println("Voice Control: " + (voiceControl ? "Enabled" : "Disabled"));
        System.out.println("Connectivity: " + connectivity);
        System.out.println("Battery Life: " + batteryLife + " months");
        System.out.println("Model: " + model);
    }
}

class SmartTV {
    String brand;
    String model;
    String os;
    double price;
    DisplayPanel panel;
    SpeakerSystem speakers;
    RemoteControl remote = new RemoteControl(true, "Bluetooth", 12, "RM-X550");

    public SmartTV(String brand, String model, String os, double price, DisplayPanel panel) {
        super();
        this.brand = brand;
        this.model = model;
        this.os = os;
        this.price = price;
        this.panel = panel;
        speakers = new SpeakerSystem(40, true, "Surround", "Sony");
    }

    public void displaySmartTV() {
        System.out.println("\n========================== SMART TV ==========================");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Operating System: " + os);
        System.out.println("Price: " + price);
    }
}

public class SmartTvDriver {
    public static void main(String[] args) {
        DisplayPanel panel = new DisplayPanel("4K UHD", 55, "OLED", "120Hz");
        
        SmartTV tv = new SmartTV("Sony", "Bravia XR", "Google TV", 125000, panel);

        tv.displaySmartTV();
        tv.panel.displayPanelInfo();
        tv.speakers.displaySpeakerInfo();
        tv.remote.displayRemoteInfo();
    }
}
