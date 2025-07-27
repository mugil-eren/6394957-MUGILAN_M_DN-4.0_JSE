import React from 'react';

function Post({ title, body }) {
  return (
    <div style={{ border: '1px solid #ccc', margin: '15px', padding: '10px', borderRadius: '8px' }}>
      <h3>{title}</h3>
      <p>{body}</p>
    </div>
  );
}

export default Post;
