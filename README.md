<h1>🎮 The Gaming Room - Java Web Application</h1>
<h2>CS-230 Operating Platforms Project</h2>
<p>This repository contains the source code and supporting files for <i>The Gaming Room</i>, a fictional game development client project completed for the <b>CS 230: Operating Platforms</b> course. The app is designed to run across multiple platforms and support RESTful game communication and authentication.</p>

<h3>Journal Submission</h3>
<p>This project was brought on by a client, <b>The Gaming Room</b>, who wanted a web-based version of their existing Android game <i>Draw It, or Lose It</i>. The new version is meant to support a broader audience across different platforms, while also ensuring that only one active game session exists in memory at any given time. Additionally, the solution needed to offer centralized control of timing, game flow, and user sessions to create a seamless multiplayer experience.</p> <p>In order to achieve this, I had to carefully review the requirements and break them down into business and technical needs. I'm particularly proud of how I was able to clearly call out the different areas of technical focus needed to satisfy the client’s goals. I think I did especially well in tying the technical requirements to the outcomes the client was expecting. One part of the design document that I found surprisingly helpful was identifying the <b>Design Constraints</b> and <b>Implications</b>. Taking the time to think through the limitations and possible impacts helped me better understand the system as a whole and gave me more direction when making design choices.</p> <p>If I were to revise one part of my work on these documents, I would probably revisit the <b>Use Case Descriptions</b> and <b>User Stories</b>. I think I could have provided more detailed steps and addressed more edge cases for the user interactions. Having better-documented scenarios would make it easier to validate whether the solution met all user expectations during testing.</p> <p>When it came to interpreting the user’s needs, I focused on the core objectives: platform independence, efficient memory usage, and smooth game control. I translated these needs into specific design elements like enforcing a single game instance using the singleton pattern, leveraging RESTful APIs to ensure cross-platform functionality, and utilizing a session management system to track active users and teams in real-time. Considering the user's needs is essential because software that doesn’t align with how users expect to interact with it risks poor adoption or failure. Meeting those expectations is what ultimately determines whether the software is useful and successful. When the design keeps the user at the center, it helps create a solution that is not only functional but enjoyable to use.</p> <p>My approach to designing this software was to break it down into manageable pieces, starting with the big picture and gradually working through each layer of functionality. I leaned on modular design and the client-server architecture pattern to ensure scalability and maintainability. I also made sure to incorporate established design patterns, like the singleton, to meet specific system constraints. In future projects, I would continue using techniques like early prototyping, detailed wireframing, and creating more robust user stories to better visualize the system and catch potential issues early on. I also see the value in including stakeholders in iterative feedback loops throughout the design phase, to make sure the evolving solution continuously meets the intended goals.</p>

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