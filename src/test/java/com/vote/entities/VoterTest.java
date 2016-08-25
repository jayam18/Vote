package com.vote.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 8/25/16.
 */
public class VoterTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldsetNameforVoter() throws Exception {
        Voter v = new Voter();
        v.setName("Sally");
        assertEquals("Sally", v.getName());

    }


}