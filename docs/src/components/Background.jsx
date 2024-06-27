
/* eslint-disable no-unused-vars */
import React from 'react'

function Background() {
  return (
    <div className='fixed z-[2] w-full h-screen '>
      <div style={{ top: '5%', width: '100%', padding: '2.5rem 0', display: 'flex', justifyContent: 'center', color: '#718096', fontWeight: '600', fontSize: '1.25rem' }}>
        Documents
      </div>
      <h1 style={{ position: 'absolute', top: '50%', left: '50%', transform: 'translate(-50%, -50%)', fontSize: '13vw', fontWeight: '600', lineHeight: '1', color: '#1a202c' }}>
        Docs.
      </h1>
    </div>
  )
}

export default Background
