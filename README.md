# School-Project-Movie-categorizer-with-Binary-SearchTree
Subject: Data Structures and Algorithms II (SEN2212)
Project: Movie Categorizer
Project Members
Halis Bilal Kara 1804925-backend
Kaan Kamil 1806821-flow chart
Ziya Bahçeci 1805421-report

Project Details
The aim of this project is making it easier for users to rate and categorize the movies they watched of each genre. The program lets the user rate the movies and then it lists them in a tree so the user can see their ratings again later. The program has 5 main functions; adding a movie to the list, see all movies in the tree, updating a movie, delete a movie and the “save and exit” function. Linked lists are also used in this project.
1.	Adding a movie to the tree: In start menu, in order to add a movie to the list, the user should enter 1 to initialize “Press 1 to add a new film” function. After that, the movie genre should be chosen by entering the buttons set for the genre (sci-fi, horror, comedy, drama, romance). After the genre is chosen, the user should enter the movie name, movie year and their rating to the movie in that order. Then the movie will be added to the tree and the program will say “Film, year and rate added to the sci-fi tree” and return to the start menu.
<img src="/img/1.jpeg" alt="img1"/>
 
2.	See all movies in the tree: In start menu, in order to see all the movies in the tree the user should enter number 2 in the console and initialize “press 2 to see all films in the tree” command. This command will list all movies, their year and rating each in their own genre. Then the program will say “All films listed” and return to the start menu.
 

3.	Updating a movie already in the tree: In the start menu, in order to update a movie’s name, year and rating, the user should enter number 3 and initialize “Press 3 to update film” command. Then, enter the movie’s genre, and then the movie’s previous name and previous rating. Then they will be able to re-enter the new name, year and new rating of the movie. After those are done, the program will go back to the start menu.
 




4.	Deleting a movie from the tree: In order to delete a film from the list, the user should enter number 4 and initialize the command “Press 4 to delete film”. After that, the user should choose the existing movie’s category. Then they should enter the movie’s name and rating in order. This will delete the movie in the tree and go back to start menu.
 
5.	Save and exit: Simply, when the user enters 0 and initializes the command “save and exit”, the program turns all trees to string and gets saved in a txt file. Next time the program is started, propgram reads the txt file and turns it back into tree.
 WRONG COMMAND: When in console, the command written and/or entered is wrong, the program will not give an exception but instead tell the user the mistake.
