class Solution {

    static void build_graph(HashMap<Integer, List<int[]>> map, int[][] times) {
        for (int[] t : times) {
            map.putIfAbsent(t[0], new ArrayList<>());
            map.get(t[0]).add(new int[]{t[1], t[2]});
        }
    }

    public int networkDelayTime(int[][] times, int n, int k) {

        HashMap<Integer, List<int[]>> map = new HashMap<>();
        build_graph(map, times);

        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[k] = 0;

        PriorityQueue<int[]> pq =
                new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));

        pq.add(new int[]{k, 0});

        while (!pq.isEmpty()) {

            int[] cur = pq.poll();

            int node = cur[0];
            int d = cur[1];

            if (d > dist[node]) continue;

            if (!map.containsKey(node)) continue;

            for (int[] edge : map.get(node)) {

                int next = edge[0];
                int wt = edge[1];

                if (dist[next] > dist[node] + wt) {

                    dist[next] = dist[node] + wt;

                    pq.add(new int[]{next, dist[next]});
                }
            }
        }

        int ans = 0;

        for (int i = 1; i <= n; i++) {
            if (dist[i] == Integer.MAX_VALUE)
                return -1;
            ans = Math.max(ans, dist[i]);
        }

        return ans;
    }
}