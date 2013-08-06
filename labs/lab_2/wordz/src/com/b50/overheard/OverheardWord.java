package com.b50.overheard;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

import org.json.JSONArray;
import org.json.JSONObject;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.b50.gesticulate.SwipeDetector;
import com.b50.savvywords.Definition;
import com.b50.savvywords.Word;
import com.b50.savvywords.WordStudyEngine;

public class OverheardWord extends DefaultActivity {

	private GestureDetector gestureDetector;
	private static WordStudyEngine engine;
	private static LinkedList<Word> wordsViewed;
	private static int viewPosition = -1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Log.d(APP, "onCreated Invoked");
		/**
		 * Hint: this layout can be found in the res/layout directory.
		 * Does it do anything? This is supposed to be a study-like
		 * activity. 
		 */
		setContentView(R.layout.nothing);
		/**
		 * Next, follow the steps & fill in the missing
		 * methods
		 */
		//Step 1: initialize gestures
				
		//Step 2: initialize engine instances + viewed words
		
		//Step 3: display the initial word
		
		//remove this when you've done something
		this.scheduleHintToast();
	}
	
	/**
	 * Hint: this needs to be done first (i.e. this is step #1!)
	 */
	@SuppressWarnings("unused")
	private void initializeGestures() {
		gestureDetector = initGestureDetector();

		View view = findViewById(R.id.LinearLayout1);

		view.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
			}
		});

		view.setOnTouchListener(new View.OnTouchListener() {
			public boolean onTouch(View v, MotionEvent event) {
				return gestureDetector.onTouchEvent(event);
			}
		});
	}
	
	/**
	 * This is step #2
	 * Ponder this: why are engine & wordsViewed static?	  
	 */
	@SuppressWarnings("unused")
	private void initializeEngineAndViewedWords() {
		List<Word> words = buildWordList();
		if (engine == null) {
			engine = WordStudyEngine.getInstance(words);
		}

		if (wordsViewed == null) {
			wordsViewed = new LinkedList<Word>();
		}
	}
	
	/**
	 * This is step #3
	 * Further thoughts: what does displayWord do? Hint, go see it! 
	 */
	@SuppressWarnings("unused")
	private void displayInitialWord() {
		Word firstWord = engine.getWord();
		wordsViewed.add(firstWord);
		viewPosition++;
		displayWord(firstWord);
	}
	
	/**
	 * By default, this code doesn't do anything other than detect a swipe. 
	 * Can you make it do something interesting? 
	 * 
	 * HINT: this method creates an anonymous class; take a look at the 
	 * methods within it. 
	 * 
	 * @return initialized GestureDetector instance
	 */
	private GestureDetector initGestureDetector() {
		return new GestureDetector(new SimpleOnGestureListener() {
			/**
			 * Your job: handle the swipes! If a user swipes to the left, for example,
			 * don't they want to see the next word? And if they swipe right, wouldn't 
			 * they expect to see the previous word?
			 */
			public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
				try {
					final SwipeDetector detector = new SwipeDetector(e1, e2, velocityX, velocityY);
					if (detector.isDownSwipe()) {
						return false;
					} else if (detector.isUpSwipe()) {
						return false;
					} else if (detector.isLeftSwipe()) {
						return false;
					} else if (detector.isRightSwipe()) {
						return false;
					}
				} catch (Exception e) {
					// nothing
				}
				return doNothing();
			}

			@SuppressWarnings("unused")
			private boolean showPreviousWord() {
				if (wordsViewed.size() > 0 && (listSizeAndPositionEql() || (viewPosition >= 0))) {
					displayWord(wordsViewed.get(--viewPosition));
					return true;
				} else {
					return doNothing();
				}
			}
			
			@SuppressWarnings("unused")
			private boolean showNextWord() {
				if (listSizeAndPositionEql()) {
					viewPosition++;
					Word wrd = engine.getWord();
					wordsViewed.add(wrd);
					displayWord(wrd);
					return true;
				} else if (wordsViewed.size() > (viewPosition + 1)) {
					if (viewPosition == -1) {
						viewPosition++;
					}
					displayWord(wordsViewed.get(++viewPosition));
					return true;
				} else {
					return doNothing();
				}
			}

			private boolean doNothing() {
				return false;
			}

			@SuppressWarnings("unused")
			private boolean startQuiz() {
				startActivity(new Intent(getApplicationContext(), OverheardQuiz.class));
				return true;
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.overheard_word, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.quit_item:
			this.finish();
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}
	
	private void displayWord(Word aWord) {
		TextView wordView = (TextView) findViewById(R.id.word_study_word);
		wordView.setText(aWord.getSpelling());

		Definition firstDef = aWord.getDefinitions().get(0);
		TextView wordPartOfSpeechView = (TextView) findViewById(R.id.word_study_part_of_speech);
		wordPartOfSpeechView.setText(firstDef.getPartOfSpeech());

		TextView defView = (TextView) findViewById(R.id.word_study_definition);
		defView.setText(formatDefinition(aWord));
	}

	private String formatDefinition(final Word startingWord) {
		return formatDefinition(startingWord.getDefinitions().get(0).getDefinition());
	}

	private String formatDefinition(final String definition) {
		String firstChar = definition.substring(0, 1).toUpperCase(Locale.ENGLISH);
		StringBuffer buff = new StringBuffer(firstChar);
		buff.append(definition.substring(1, (definition.length() + 0)));
		if (!definition.endsWith(".")) {
			buff.append(".");
		}
		return buff.toString();
	}

	private List<Word> buildWordList() {
		InputStream resource = getApplicationContext().getResources().openRawResource(R.raw.words);
		List<Word> words = new ArrayList<Word>();
		try {
			StringBuilder sb = new StringBuilder();
			BufferedReader br = new BufferedReader(new InputStreamReader(resource));
			String read = br.readLine();

			while (read != null) {
				sb.append(read);
				read = br.readLine();
			}

			JSONObject document = new JSONObject(sb.toString());
			JSONArray allWords = document.getJSONArray("words");
			for (int i = 0; i < allWords.length(); i++) {
				words.add(Word.manufacture(allWords.getJSONObject(i)));
			}

		} catch (Exception e) {
			Log.e(APP, "Exception in getInstance for WordEngine: " + e.getLocalizedMessage());
		}
		return words;
	}
	
	private boolean listSizeAndPositionEql() {
		return wordsViewed.size() == (viewPosition + 1);
	}
	
	private void scheduleHintToast() {
		final Handler handler = new Handler();
		handler.postDelayed(new Runnable() {
			public void run() {
				// now quickly show a how to
				final Toast toast = Toast.makeText(getApplicationContext(),
						"Make this app do something! Select the correct layout and add swipe behavior.", Toast.LENGTH_LONG);
				toast.setGravity(Gravity.CENTER, 0, 0);
				final LinearLayout toastView = (LinearLayout) toast.getView();
				final ImageView imageCodeProject = new ImageView(getApplicationContext());
				imageCodeProject.setImageResource(R.drawable.warningw);
				toastView.addView(imageCodeProject, 0);
				toast.show();
			}
		}, 1500);
	}

}
