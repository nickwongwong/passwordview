:eyes: "All eyes, yeah I see 'em" — [Yo Gotti, Down in the DM](https://genius.com/Yo-gotti-down-in-the-dm-lyrics)

`compile 'com.xwray:passwordview:0.1'`

### Drop-in Android password view for the new material design spec
    <com.xwray.passwordview.PasswordView
      android:layout_width="match_parent"
      android:layout_height="wrap_content"
      android:hint="@string/password_hint" />

<img src="https://raw.githubusercontent.com/lisawray/passwordview/master/2016-3-15.png" width="400px" />

### Toggle password visibility
Touch the "eye" icon to toggle between traditional and visible password states.  

### Custom typeface support
In the spec, the password field is pictured in Roboto. I really liked how this looked, so, I made PasswordView support custom typefaces!  If you set one, it will stay. If you don't, the default is still `monospace` — no worries.

`passwordView.setTypeface(roboto);`

### Optional strikethrough
By default, PasswordView adheres exactly to the spec, using 54% / 38% opacity for the visibility icon.

If you find opacity too subtle (insert eye roll :eyes:), you can use the visibility icon with a strikethrough instead. 
(idea credit, [@thekeeperofpie](https://github.com/TheKeeperOfPie))

`app:useStrikeThrough="true"` /  `passwordView.setUseStrikethrough(true)`

### Coming soon to a jcenter near you ...

*in the meantime you can use `maven { url 'https://dl.bintray.com/lisawray/maven' }` in your top-level `build.gradle`


