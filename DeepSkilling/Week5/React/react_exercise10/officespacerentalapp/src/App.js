import React from "react";

function App() {

  // Single Office Object
  const office = {
    name: "Skyline Business Center",
    rent: 55000,
    address: "MG Road, Bengaluru",
    image: "/office1.jpg"
  };

  // List of Offices
  const officeList = [
    {
      name: "Skyline Business Center",
      rent: 55000,
      address: "MG Road, Bengaluru",
      image: "/office1.jpg"
    },
    {
      name: "Tech Park Office",
      rent: 75000,
      address: "Hitech City, Hyderabad",
      image: "/office2.jpg"
    },
    {
      name: "Corporate Hub",
      rent: 62000,
      address: "Sector 62, Noida",
      image: "/office1.jpg"
    }
  ];

  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>

      <h1>Office Space Rental App</h1>

      <h2>Featured Office</h2>

      <img
        src={office.image}
        alt="Office"
        width="400"
        height="250"
      />

      <h3>Name: {office.name}</h3>

      <h3
        style={{
          color: office.rent < 60000 ? "red" : "green"
        }}
      >
        Rent: ₹{office.rent}
      </h3>

      <h3>Address: {office.address}</h3>

      <hr />

      <h2>Available Office Spaces</h2>

      {
        officeList.map((item, index) => (
          <div
            key={index}
            style={{
              border: "1px solid gray",
              padding: "15px",
              marginBottom: "20px",
              width: "420px"
            }}
          >
            <img
              src={item.image}
              alt="Office"
              width="400"
              height="250"
            />

            <h3>{item.name}</h3>

            <h3
              style={{
                color: item.rent < 60000 ? "red" : "green"
              }}
            >
              Rent: ₹{item.rent}
            </h3>

            <h3>{item.address}</h3>

          </div>
        ))
      }

    </div>
  );
}

export default App;