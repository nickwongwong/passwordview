# a material design password view
:eyes: "All eyes, yeah I see 'em" — [Yo Gotti, Down in the DM](https://genius.com/Yo-gotti-down-in-the-dm-lyrics)

A Material Design Spec - approved Android password view that toggles password visibility via an eye icon.

<img src="https://raw.githubusercontent.com/lisawray/passwordview/master/2016-3-15.png" width="400px"/>

    <com.xwray.passwordview.PasswordView
      android:layout_width="match_parent"
      android:layout_height="wrap_content"
      android:hint="@string/password_hint" />

# Custom typeface support
In the spec, the password field is pictured in Roboto. So, I made PasswordView support custom typefaces!  If you set one, it will stay.  If you don't, the default is still `monospace` — no worries.

`passwordView.setTypeface(roboto);`

# Optional strikethrough
By default, PasswordView adheres exactly to the spec, using 54% / 38% opacity for the visibility icon.

If you find opacity too subtle (insert eye roll :eyes:), you can use the visibility icon with a strikethrough instead. 
([@thekeeperofpie](https://github.com/TheKeeperOfPie) gave me this idea.)

`app:useStrikeThrough="true"`

`passwordView.setUseStrikethrough(true)`




Feedback and pull requests welcomed! 
