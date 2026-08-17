package track.M02.T07;

public class DebugAndTraceArrayStateChanges {
    public static void main(String[] args) {

        int[] original = { 14, 18, 22, 26 };
        int updateIndex = 1;
        int updateValue = 25;
        int requestedIndex = 4;

        int[] snapshot = new int[original.length];

        // Copy every element into snapshot
        for (int i = 0; i < original.length; i++) {
            snapshot[i] = original[i];
        }

        int[] liveView = original;

        // Update through liveView
        if (updateIndex >= 0 && updateIndex < original.length) {
            liveView[updateIndex] = updateValue;
        }

        // Validate requestedIndex before accessing original
        String requestedResult;

        if (requestedIndex >= 0 && requestedIndex < original.length) {
            requestedResult = String.valueOf(original[requestedIndex]);
        } else {
            requestedResult = "Invalid index";
        }

        // Display original
        System.out.print("Original: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }
        System.out.println();

        // Display snapshot
        System.out.print("Snapshot: ");
        for (int i = 0; i < snapshot.length; i++) {
            System.out.print(snapshot[i] + " ");
        }
        System.out.println();

        // Reference comparison
        System.out.println("Same object: " + (liveView == original));

        // Requested value
        System.out.println("Requested value: " + requestedResult);
    }
}
