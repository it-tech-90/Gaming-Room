# Gaming-Room
Gaming room Java-based web app

<h1>🎮 The Gaming Room - Java Web Application</h1>
<p>This repository contains the source code and supporting files for <i>The Gaming Room</i>, a fictional game development client project completed for the <b>CS 230: Operating Platforms</b> course. The app is designed to run across multiple platforms and support RESTful game communication and authentication.</p>

<h1>🧱 Overview</h1>
<p>The project was built using Java, following clean software design patterns and modular development practices and includes:</p>
<ul>
<li>A RESTful service layer to handle client-server communication</li>
<li>Game, Team, and Player domain models</li>
<li>Singleton pattern to ensure only one game instance isa ctive in memory</li>
<li>Secure user authentication system</li>
</ul>

<h1>📂 Folder Breakdown</h1>
<h2><i>Gaming-Room-Source/</i></h2>
<p>Contains the core logic for game management:</p>
<ul>
<li><i>Game, Team</i>, and <i>Player</i> entity classes (extending a shared <i>Entity</i> superclass)</li>
<li><i>GameService</i> class implementing the <b>Singleton</b> pattern</li>
<li>REST controllers to handle game creation and management</li>
<li>Domain model showcasing object relationships</li>
<li>Utility classes for initiating and testing game logic</li>
</ul>

<h2><i>Gaming-Room-Auth/</i></h2>
<p>Handles user authentication and includes:</p>
<ul>
<li>Login and session management</li>
<li>User credential validation and role-based access control</li>
<li>In-memory user database using <i>HashMap</i></li>
<li>REST API using Jersey annotations</li>
<li>Module controller structure</li>
<li>Health check endpoint for service monitoring</li>
</ul>

<h1>📚Lessons Learned</h1>
<p>This project helped me understand:</p>
<ul>
<li>Object-oriented programming (OOP) principles</li>
<li>Clean modular design</li>
<li>The use of inheritance and polymorphism</li>
<li>The application of the Singleton pattern for managing shared state</li>
<li>RESTful service implementation using Dropwizard / Jersey</li>
<li>Secure handling of user authentication and role validation</li>
<li>Use of POJOs, controllers, and configuration classes</li>
<li>In-memory credential storage using collections</li>
<li>API security architecture principles</li>
</ul>