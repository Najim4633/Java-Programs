
public class MarkerSort {

    // Insertion Sort in Descending Order based on color
    public static void sortByColorDesc(Marker[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Marker key = arr[i];
            int j = i - 1;

            // Compare colors in descending order (lexicographically)
            while (j >= 0 && arr[j].color.compareTo(key.color) < 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        // Base marker
        Marker base = new Marker("Camlin", "Permanent", 10.0, "red");

        // Create array of markers using copy constructor with different colors
        Marker[] markers = new Marker[5];
        markers[0] = new Marker(base, "red");
        markers[1] = new Marker(base, "green");
        markers[2] = new Marker(base, "blue");
        markers[3] = new Marker(base, "black");
        markers[4] = new Marker(base, "orange");

        System.out.println("Before Sorting:");
        for (Marker m : markers) {
            m.display();
        }

        sortByColorDesc(markers);

        System.out.println("\nAfter Sorting by Color Descending:");
        for (Marker m : markers) {
            m.display();
        }
    }
}

    class Marker {
        String brand;
        String type;
        double prize;
        String color;
    
        // Constructor
        Marker(String brand, String type, double prize, String color) {
            this.brand = brand;
            this.type = type;
            this.prize = prize;
            this.color = color;
        }
    
        // Copy constructor
        Marker(Marker m, String color) {
            this.brand = m.brand;
            this.type = m.type;
            this.prize = m.prize;
            this.color = color;
        }
    
        public void display() {
            System.out.println(brand + " | " + type + " | " + prize + " | " + color);
        }
    }