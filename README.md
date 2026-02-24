
# Spring Security Documentation & API Testing Guide

![Spring Security](https://img.shields.io/badge/Spring_Security-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=white)
![Bootstrap](https://img.shields.io/badge/Bootstrap-7952B3?style=for-the-badge&logo=bootstrap&logoColor=white)
![GitHub Pages](https://img.shields.io/badge/GitHub_Pages-222222?style=for-the-badge&logo=githubpages&logoColor=white)

Live Demo: [https://yourusername.github.io/spring-security-docs](https://yourusername.github.io/spring-security-docs)

## 📖 Overview

This is a comprehensive documentation website for Spring Security implementation featuring both **Stateful (with CSRF)** and **Stateless (no CSRF)** configurations. The site includes:

- **Stateful Mode**: Full CSRF protection with session management
- **Stateless Mode**: REST API focused, no CSRF tokens needed
- **Interactive Testing Guide**: Step-by-step API testing with screenshots
- **Implementation Code**: Complete Java configuration examples
- **Troubleshooting**: Common errors and solutions

## 🚀 Features

- ✅ **Dual Mode Support**: Toggle between Stateful/Stateless implementations
- ✅ **Visual Guides**: Screenshots and diagrams for better understanding
- ✅ **Code Examples**: Ready-to-use Spring Security configuration
- ✅ **API Testing**: Complete Postman/curl testing instructions
- ✅ **Mobile Responsive**: Works perfectly on all devices
- ✅ **No Backend Required**: Pure HTML/CSS/JS with Bootstrap

## 📁 Project Structure
```
spring-security-docs/
├── index.html # Main documentation page
├── README.md # This file
├── .gitignore # Git ignore rules
├── images/ # All screenshots and diagrams
│ ├── forbiddend.png
│ ├── unauthorized.png
│ ├── get-csrf-token-endpoint.png
│ └── ... (all your images)
└── (optional folders)
└── css/ # Additional CSS if needed
```


## 🔧 Setup Instructions

### Local Viewing
Simply open `index.html` in any modern web browser.

### GitHub Pages Deployment
1. Push to GitHub repository
2. Go to Repository Settings → Pages
3. Select "Deploy from branch"
4. Choose `main` branch and `/root` folder
5. Save - Your site will be live at `https://username.github.io/repository-name`

## 🧪 Testing the Documentation

### Stateful Mode (CSRF Enabled)
1. Click "Stateful (CSRF)" button
2. Follow CSRF token acquisition steps
3. Test POST endpoints with X-CSRF-TOKEN header

### Stateless Mode (CSRF Disabled)
1. Click "Stateless (No CSRF)" button
2. Test endpoints with only HTTP Basic Auth
3. No CSRF tokens required

## 📸 Screenshots

| Stateful Mode | Stateless Mode |
|--------------|---------------|
| ![Stateful](images/forbiddend.png) | ![Stateless](images/stateless-null-csrf.png) |

## 📚 Resources

### External Articles Referenced
- **[Stateful CSRF Guide](https://medium.com/@thecodebean/implementing-csrf-security-in-a-spring-boot-application-d1e1d128ca1d)** - Detailed CSRF implementation
- **[Stateless REST API Security](https://www.baeldung.com/csrf-stateless-rest-api)** - Baeldung guide on CSRF for stateless APIs

### Spring Security Official Docs
- [Spring Security Reference](https://docs.spring.io/spring-security/reference/index.html)
- [Spring Boot Security](https://spring.io/guides/gs/securing-web/)

## 👥 Contributors

- **Subburathinam M** - Documentation & Implementation
- [Add contributors here]

## 📄 License

This documentation is provided under the [MIT License](LICENSE).

## ⭐ Support

If you find this documentation helpful, please give it a ⭐ on GitHub!

---

*Built with ❤️ using Bootstrap 5, Highlight.js, and Font Awesome*
