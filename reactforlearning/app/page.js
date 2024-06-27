"use client"
import React, { useState } from 'react'

const page = () => {
 const [marks, setmarks] = useState(80)
  return (
    <>
    <h1>marks{marks}</h1>
   <button onClick={()=>{
    setmarks(33)
   }}>update</button>
  </>
    
  )
}

export default page
