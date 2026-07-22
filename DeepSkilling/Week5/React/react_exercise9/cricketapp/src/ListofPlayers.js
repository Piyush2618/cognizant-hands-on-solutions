import React from "react";

function ListofPlayers() {

    const players = [
        { name: "Virat Kohli", score: 95 },
        { name: "Rohit Sharma", score: 88 },
        { name: "Shubman Gill", score: 67 },
        { name: "KL Rahul", score: 72 },
        { name: "Hardik Pandya", score: 45 },
        { name: "Ravindra Jadeja", score: 80 },
        { name: "R Ashwin", score: 60 },
        { name: "Mohammed Shami", score: 50 },
        { name: "Jasprit Bumrah", score: 78 },
        { name: "Mohammed Siraj", score: 69 },
        { name: "Ishan Kishan", score: 84 }
    ];

    const below70 = players.filter(player => player.score < 70);

    return (
        <div>
            <h2>List of Players</h2>

            <h3>All Players</h3>

            <ul>
                {players.map((player, index) => (
                    <li key={index}>
                        {player.name} - {player.score}
                    </li>
                ))}
            </ul>

            <h3>Players with Score Below 70</h3>

            <ul>
                {below70.map((player, index) => (
                    <li key={index}>
                        {player.name} - {player.score}
                    </li>
                ))}
            </ul>
        </div>
    );
}

export default ListofPlayers;