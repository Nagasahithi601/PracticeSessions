package Streams.FlatMap;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapStr {
    public static void main(String[] args) {
        List<String> teamA = Arrays.asList("Ayyappa", "Sahithi");
        List<String> teamB = Arrays.asList("Anil", "Chandana");
        List<String> teamC = Arrays.asList("Jaya", "Manju");
        List<List<String>> players = Arrays.asList(teamA, teamB, teamC);
        List<String> allPlayers1 = players.stream().flatMap(n->n.stream()).collect(Collectors.toList());
        List<String> allPlayers = players.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(allPlayers);
    }
}
