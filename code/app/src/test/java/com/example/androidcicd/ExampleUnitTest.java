package com.example.androidcicd;

import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.*;

import com.example.androidcicd.movie.MovieProvider;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    public static class MovieProviderTest {
        @Mock
        private FirebaseFirestore mockFirestore;

        @Mock
        private CollectionReference mockMovieCollection;

        @Mock
        private DocumentReference mockDocRef;

        private MovieProvider movieProvider;
    }
}