package com.noctualab.framebook;

import com.noctualab.framebook.slides.SlidePageFragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;

public class FramebookActivity extends FragmentActivity {

	/**
	 * The number of pages (wizard steps) to show in this demo.
	 */
	private static final int NUM_PAGES = 5;

	/**
	 * The pager widget, which handles animation and allows swiping horizontally to access previous
	 * and next wizard steps.
	 */
	private ViewPager mPager;

	/**
	 * The pager adapter, which provides the pages to the view pager widget.
	 */
	private PagerAdapter mPagerAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_framebook);


		// Instantiate a ViewPager and a PagerAdapter.
		mPager = (ViewPager) findViewById(R.id.pager);
		mPagerAdapter = new SlidesPagerAdapter(getSupportFragmentManager());
		mPager.setAdapter(mPagerAdapter);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onBackPressed() {
		if (mPager.getCurrentItem() == 0) {
			// If the user is currently looking at the first step, allow the system to handle the
			// Back button. This calls finish() on this activity and pops the back stack.
			super.onBackPressed();
		} else {
			// Otherwise, select the previous step.
			mPager.setCurrentItem(mPager.getCurrentItem() - 1);
		}
	}


	/**
	 * A simple pager adapter that represents 5 ScreenSlidePageFragment objects, in
	 * sequence.
	 */
	private class SlidesPagerAdapter extends FragmentStatePagerAdapter {
		public SlidesPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int position) {
			return new SlidePageFragment();
		}

		@Override
		public int getCount() {
			return NUM_PAGES;
		}
	}

}
