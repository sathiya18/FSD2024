/*import React, { Component } from 'react'; 
class Demo extends React.Component { 
constructor() { 
super(); 
this.state = { 
data: 
[ 
{ 
"name":"Anand" 
}, 
{ 
"name":"Vivek" 
}, 
{ 
"name":"Kumar" 
} 
] 
} 
} 
render() { 
return ( 
<div> 
<StudentName/> 
<ul> 
{this.state.data.map((item) => <List data = {item} />)} 
</ul> 
</div> 
); 
} 
} 
class StudentName extends React.Component { 
render() { 
return ( 
<div> 
<h1>Student Name Detail</h1> 
</div> 
); 
} 
} 
class List extends React.Component { 
render() { 
return ( 
<ul> 
<li>{this.props.data.name}</li> 
</ul> 
); 
} 
} 
export default Demo; */


import React, { Component } from 'react';
class Demo extends React.Component {
constructor() {
super();
this.state = { displayBio: false };
console.log('Component this', this);
this.toggleDisplayBio = this.toggleDisplayBio.bind(this);
}
toggleDisplayBio(){
this.setState({displayBio: !this.state.displayBio});
}
render() {
return (
<div>
<h1>Welcome to PTU!!</h1>
{
this.state.displayBio ? (
<div>
<p><h4>First State University in Puducherry</h4></p>
<button onClick={this.toggleDisplayBio}> Show Less </button>
</div>
) : (
<div>
<button onClick={this.toggleDisplayBio}> Read More </button>
</div>
)
}
</div>
)
}
}
export default Demo; 
