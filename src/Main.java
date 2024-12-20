// Bus Class
class Bus {
    private String busNumber;
    private int capacity;
    private String route;

    // Constructor
    public Bus(String busNumber, int capacity, String route) {
        this.busNumber = busNumber;
        this.capacity = capacity;
        this.route = route;
    }

    // Getter and Setter methods
    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    // Method to display bus details
    public void displayBusDetails() {
        System.out.println("Bus Number: " + busNumber + ", Capacity: " + capacity + ", Route: " + route);
    }

    // Method to compare two Bus objects
    public boolean equals(Bus other) {
        return this.busNumber.equals(other.busNumber);
    }
}

// Commuter Class
class Commuter {
    private String commuterId;
    private String name;
    private int age;

    // Constructor
    public Commuter(String commuterId, String name, int age) {
        this.commuterId = commuterId;
        this.name = name;
        this.age = age;
    }

    // Getter and Setter methods
    public String getCommuterId() {
        return commuterId;
    }

    public void setCommuterId(String commuterId) {
        this.commuterId = commuterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to display commuter details
    public void displayCommuterDetails() {
        System.out.println("Commuter ID: " + commuterId + ", Name: " + name + ", Age: " + age);
    }

    // Method to compare two Commuter objects
    public boolean equals(Commuter other) {
        return this.commuterId.equals(other.commuterId);
    }
}

// TransportService Class
class TransportService {
    private String serviceName;
    private Bus[] buses;
    private Commuter[] commuters;
    private int busCount;
    private int commuterCount;

    // Constructor
    public TransportService(String serviceName) {
        this.serviceName = serviceName;
        this.buses = new Bus[10]; // Assuming maximum of 10 buses
        this.commuters = new Commuter[10]; // Assuming maximum of 10 commuters
        this.busCount = 0;
        this.commuterCount = 0;
    }

    // Getter and Setter methods
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    // Method to add a bus
    public void addBus(Bus bus) {
        if (busCount < buses.length) {
            buses[busCount++] = bus;
        }
    }

    // Method to add a commuter
    public void addCommuter(Commuter commuter) {
        if (commuterCount < commuters.length) {
            commuters[commuterCount++] = commuter;
        }
    }

    // Method to display service details
    public void displayServiceDetails() {
        System.out.println("Service Name: " + serviceName);
        System.out.println("Buses:");
        for (int i = 0; i < busCount; i++) {
            buses[i].displayBusDetails();
        }
        System.out.println("Commuters:");
        for (int i = 0; i < commuterCount; i++) {
            commuters[i].displayCommuterDetails();
        }
    }

    // Method to compare two TransportService objects
    public boolean equals(TransportService other) {
        return this.serviceName.equals(other.serviceName);
    }
}

// Main Class to test the functionality
public class Main {
    public static void main(String[] args) {
        // Creating Bus objects
        Bus bus1 = new Bus("B101", 50, "Route A");
        Bus bus2 = new Bus("B102", 60, "Route B");

        // Creating Commuter objects
        Commuter commuter1 = new Commuter("C001", "John Doe", 25);
        Commuter commuter2 = new Commuter("C002", "Jane Smith", 30);

        // Creating TransportService object
        TransportService service1 = new TransportService("City Transport");

        // Adding buses and commuters to the service
        service1.addBus(bus1);
        service1.addBus(bus2);
        service1.addCommuter(commuter1);
        service1.addCommuter(commuter2);

        // Displaying service details
        service1.displayServiceDetails();


        // Comparing objects
        System.out.println("\nComparing Buses:");
        System.out.println("Is bus1 equal to bus2? " + bus1.equals(bus2));

        System.out.println("\nComparing Commuters:");
        System.out.println("Is commuter1 equal to commuter2? " + commuter1.equals(commuter2));

        System.out.println("\nComparing Transport Services:");
        TransportService service2 = new TransportService("City Transport");
        System.out.println("Is service1 equal to service2? " + service1.equals(service2));
    }
}
