<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Job Listings</title>
    <style>
        body {
            font-family: Arial, sans-seri
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        .job-container {
            background-color: white;
            margin: 20px;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        h2 {
            margin-top: 0;
        }

        .job {
            border-bottom: 1px solid #ccc;
            padding-bottom: 10px;
            margin-bottom: 15px;
        }

        .job-title {
            font-size: 18px;
            margin-bottom: 5px;
        }

        .job-description {
            font-size: 14px;
            color: #555;
            margin-bottom: 10px;
        }

        .job-location {
            font-size: 12px;
            color: #888;
        }
    </style>
</head>
<body>
    <div class="job-container">
        <h2>Job Listings</h2>
        <li><a href="index.jsp">Home</a></li>
        <div class="job">
            <div class="job-title">Frontend Developer</div>
            <div class="job-description">We are seeking a skilled Frontend Developer to join our team...</div>
            <div class="job-location">Location: Anytown, USA</div>
            <button type="button" class="btn btn-primary w-auto me-1 mb-0">Apply now</button>
        </div>
        <div class="job">
            <div class="job-title">Backend Engineer</div>
            <div class="job-description">We're looking for an experienced Backend Engineer to work on...</div>
            <div class="job-location">Location: Cityville, USA</div>
            <button type="button" class="btn btn-primary w-auto me-1 mb-0">Apply now</button>
        </div>
        <div class="job">
            <div class="job-title">UX Designer</div>
            <div class="job-description">Join our design team to create intuitive and user-friendly interfaces...</div>
            <div class="job-location">Location: Design City</div>
            <button type="button" class="btn btn-primary w-auto me-1 mb-0">Apply now</button>
        </div>
        <div class="job">
            <div class="job-title">Data Scientist</div>
            <div class="job-description">Seeking a data scientist to analyze and interpret complex data sets...</div>
            <div class="job-location">Location: Analyticsville</div>
            <button type="button" class="btn btn-primary w-auto me-1 mb-0">Apply now</button>
        </div>
        <div class="job">
            <div class="job-title">Product Manager</div>
            <div class="job-description">Lead the product development process from ideation to launch...</div>
            <div class="job-location">Location: Product Town</div>
        </div>
        <div class="job">
            <div class="job-title">Sales Representative</div>
            <div class="job-description">Join our sales team to drive revenue and build client relationships...</div>
            <div class="job-location">Location: Sales City</div>
        </div>
        <div class="job">
            <div class="job-title">Marketing Specialist</div>
            <div class="job-description">Execute marketing campaigns and strategies to promote our brand...</div>
            <div class="job-location">Location: Marketingville</div>
            <button type="button" class="btn btn-primary w-auto me-1 mb-0">Apply now</button>
        </div>
        <div class="job">
            <div class="job-title">Content Writer</div>
            <div class="job-description">Craft compelling and engaging content for various platforms...</div>
            <div class="job-location">Location: Content Town</div>
            <button type="button" class="btn btn-primary w-auto me-1 mb-0">Apply now</button>
        </div>
        <div class="job">
            <div class="job-title">Network Administrator</div>
            <div class="job-description">Maintain and manage our network infrastructure for optimal performance...</div>
            <div class="job-location">Location: Network Central</div>
            <button type="button" class="btn btn-primary w-auto me-1 mb-0">Apply now</button>
        </div>
        <div class="job">
            <div class="job-title">HR Manager</div>
            <div class="job-description">Oversee human resources functions and foster a positive workplace...</div>
            <div class="job-location">Location: HR Headquarters</div>
            <button type="button" class="btn btn-primary w-auto me-1 mb-0">Apply now</button>
        </div>
        <div class="job">
            <div class="job-title">Financial Analyst</div>
            <div class="job-description">Analyze financial data and provide insights for informed decision-making...</div>
            <div class="job-location">Location: Finance Hub</div>
            <button type="button" class="btn btn-primary w-auto me-1 mb-0">Apply now</button>
        </div>
        <div class="job">
            <div class="job-title">Quality Assurance Engineer</div>
            <div class="job-description">Ensure the quality and reliability of our software through testing...</div>
            <div class="job-location">Location: QA Labs</div>
            <button type="button" class="btn btn-primary w-auto me-1 mb-0">Apply now</button>
        </div>
    </div>
</body>
</html>
