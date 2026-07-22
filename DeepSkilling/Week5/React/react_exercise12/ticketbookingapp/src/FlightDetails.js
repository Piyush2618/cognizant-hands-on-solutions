import React from "react";

function FlightDetails() {
  return (
    <div>
      <h2>Flight Details</h2>

      <table border="1" cellPadding="10">
        <thead>
          <tr>
            <th>Flight</th>
            <th>From</th>
            <th>To</th>
            <th>Price</th>
          </tr>
        </thead>

        <tbody>
          <tr>
            <td>AI-101</td>
            <td>Delhi</td>
            <td>Mumbai</td>
            <td>₹4500</td>
          </tr>

          <tr>
            <td>AI-202</td>
            <td>Chennai</td>
            <td>Bangalore</td>
            <td>₹2500</td>
          </tr>

          <tr>
            <td>AI-303</td>
            <td>Lucknow</td>
            <td>Hyderabad</td>
            <td>₹5000</td>
          </tr>
        </tbody>
      </table>
    </div>
  );
}

export default FlightDetails;