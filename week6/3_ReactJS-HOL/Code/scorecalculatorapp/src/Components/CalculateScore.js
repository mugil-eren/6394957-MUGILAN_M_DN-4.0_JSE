import React from 'react';

function CalculateScore() {
  const name = "Hari Govindh";
  const school = "Greenwood High School";
  const total = 450;
  const goal = 500;
  const average = (total / goal) * 100;

  return (
    <div className="score-box">
      <h2>Student Score Details</h2>
      <p><strong>Name:</strong> {name}</p>
      <p><strong>School:</strong> {school}</p>
      <p><strong>Total Marks:</strong> {total}</p>
      <p><strong>Goal:</strong> {goal}</p>
      <p><strong>Average Score:</strong> {average.toFixed(2)}%</p>
    </div>
  );
}

export default CalculateScore;
