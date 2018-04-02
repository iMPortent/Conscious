package com.example.c4q.conscious;

import com.example.c4q.conscious.model.Challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ChallengeDataSource implements ChallengeDataSourceInterface {

    private static final int sizeOfCollection = 8;
    private Random random;

    private final String[] challenges = {
            "Musical / Rhythmic Challenge",
            "Bodily / Kinesthetics Challenge",
            "Logical / Mathematial Challenge",
            "Naturalist Challenge",
            "Visual / Spatial Challenge",
            "Verbal / Linguistic Challenge",
            "Interpersonal / Social Challenge",
            "Intra - personal / Introspective Challenge"
    };

    private final String[] challengeDetails = {
            "Dive into the exploration of musical chords as you slowly become an instrumentalist",
            "Align with your SMART Goals and keep your mind and body in shape",
            "Build and crack with the algorithm you never thought you could",
            "Find and take a picture of your state bird",
            "Draw and recreate the monuments or parks of your town",
            "Learn how to say five phrases in German",
            "Attend 3 meetups this coming week",
            "Attend your local next museum exhibit and pick out five of your favorite pieces"

    };


    private final int[] drawables = {
            R.drawable.green_drawable,
            R.drawable.red_drawable,
            R.drawable.blue_drawable,
            R.drawable.yellow_drawable
    };


    public ChallengeDataSource() {
        random = new Random();
    }

    @Override
    public List<Challenges> getListOfData() {
        ArrayList<Challenges> listOfData = new ArrayList<>();
        //make 12 semi-random items
        for (int i = 0; i < sizeOfCollection; i++) {

            listOfData.add(
                    createNewChallenge()
            );
        }

        return listOfData;
    }

    @Override
    public Challenges createNewChallenge() {


        int randOne = random.nextInt(4);
        int randTwo = random.nextInt(4);
        int randThree = random.nextInt(4);


        Challenges listItem = new Challenges(
                challengeDetails[randOne],
                challenges[randTwo],
                drawables[randThree]
        );

        return listItem;
    }

    @Override
    public void deleteChallenge(Challenges challenges) {

    }

    @Override
    public void insertChallenge(Challenges temporaryChallenge) {

    }
}