import './App.css';

import BookDetails from './Components/BookDetails';
import BlogDetails from './Components/BlogDetails';
import CourseDetails from './Components/CourseDetails';

function App() {

    const show = "book";

    // Element Variable
    let component;

    if (show === "book") {
        component = <BookDetails />;
    }
    else if (show === "blog") {
        component = <BlogDetails />;
    }
    else {
        component = <CourseDetails />;
    }

    return (

        <div className="App">

            <h1>Blogger App</h1>

            {/* Method 1 : Element Variable */}
            {component}

            <hr />

            {/* Method 2 : Ternary Operator */}
            {show === "blog"
                ? <BlogDetails />
                : <CourseDetails />
            }

            <hr />

            {/* Method 3 : Logical && */}
            {show === "book" && <BookDetails />}

        </div>

    );

}

export default App;