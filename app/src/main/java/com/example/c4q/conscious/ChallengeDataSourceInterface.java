package com.example.c4q.conscious;

import com.example.c4q.conscious.model.Challenges;

import java.util.List;

/**
 * Created by C4Q on 3/31/18.
 */

interface ChallengeDataSourceInterface {


    List<Challenges> getListOfData();

    Challenges createNewChallenge();

    void deleteChallenge(Challenges challenges);

    void insertChallenge(Challenges temporaryChallenge);

}
