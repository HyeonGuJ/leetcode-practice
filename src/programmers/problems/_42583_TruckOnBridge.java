package programmers.problems;

public class _42583_TruckOnBridge {

    int weight = 0;
    int arrived = 0;

    public int solution(int bridgeLength, int maxWeight, int[] trucks) {

        int[] bridge = new int[bridgeLength];

        int time = 0;
        int index = 0;

        while (arrived < trucks.length) {

            tictoc(bridge);
            time++;

            if (index >= trucks.length || weight + trucks[index] > maxWeight) {
                continue;
            } else {
                bridge[0] = trucks[index];
                weight += trucks[index];
                index++;
            }
        }

        return time;
    }

    void tictoc(int[] bridge) {

        if (bridge[bridge.length - 1] != 0) {
            arrived++;
            weight -= bridge[bridge.length - 1];
        }
        for (int i = bridge.length - 1; i > 0; i--) {
            bridge[i] = bridge[i - 1];
        }
        bridge[0] = 0;
    }
}
