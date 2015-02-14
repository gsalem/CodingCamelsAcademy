In this assignment you are create a simple Android application that shows the user the list of all Horoscopes and in clicking on one of them opens a new page showing its details such as its from->to dates & personality traits associated with it.

The components of the apps are the following:
- MainActivity
Responsible for handling the app's fragments. Showing which one first, switching between two fragments. Think of fragments as pages.

- HoroscopeListFragment
- This fragment is the "page" that shows the list of all horoscopes. It's going to contain on its view a ListView, which is tied to its ArrayAdapter. 

- HoroscopeViewFragment
- This fragment is to take a Horoscope object then populate its view to show the Horoscope's name, from to dates, and description of the traits usually pertaining to the person of that sign.

The app is to support OS version 16+
